package exercise;

import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String URL="jdbc:mysql://localhost:3306/javaee?serverTimezone=GMT%2B8";
    private static String USER = "root";
    private static String PASSWORD="131125fei";

    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;
    private static ResultSet rst;

    private static String getDept = "select * from Dept;";
    private static String insertEmp = "insert into emp values(?, ?, ?, ?, ?, ?);";

    public static void main(String[] args) throws SQLException, ClassNotFoundException, JDOMException, IOException {
        initializeJdbc();

//        ArrayList<Dept> depts = getData();
//        createXML(depts);
        readXML();
    }


    private static ArrayList<Dept> getData() throws ClassNotFoundException, SQLException {
        ArrayList<Dept> arrayList = new ArrayList<>();

        stmt = connection.createStatement();
        assert stmt != null;
        rst = stmt.executeQuery(getDept);
        assert rst != null;
        while (rst.next()) {
            int deptno = Integer.parseInt(rst.getString(1));
            String dname = rst.getString(2);
            String loc = rst.getString(3);
            arrayList.add(new Dept(deptno, dname, loc));
        }
        return arrayList;
    }

    private static void createXML(List<Dept> depts) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        assert builder != null;
        Document doc = builder.newDocument();

        Element departments = doc.createElement("departments");

        for (Dept dept: depts) {
            Element department = doc.createElement("department");
            Element number = doc.createElement("number");
            Element name = doc.createElement("name");
            Element location = doc.createElement("location");
            number.appendChild(doc.createTextNode(String.valueOf(dept.deptno)));
            name.appendChild(doc.createTextNode(dept.dname));
            location.appendChild(doc.createTextNode(dept.loc));

            department.appendChild(number);
            department.appendChild(name);
            department.appendChild(location);
            departments.appendChild(department);
        }
        doc.appendChild(departments);

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = null;

        try {
            t = tf.newTransformer();
        } catch (TransformerConfigurationException e) {

        }
        assert t!= null;
        t.setOutputProperty(OutputKeys.ENCODING, "GBK");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("D:\\algorithm\\JavaCode\\Develop_practical_classic\\chapter_03\\src\\xml\\ex_01.xml"));
        try {
            t.transform(source, result);
        } catch (TransformerException e){

        }
    }

    private static void readXML() throws JDOMException, IOException, SQLException {
        SAXBuilder builder = new SAXBuilder();
        org.jdom2.Document read_doc = builder.build("D:\\algorithm\\JavaCode\\Develop_practical_classic\\chapter_03\\src\\xml\\ex_02.xml");

        org.jdom2.Element stu = read_doc.getRootElement();
        List list = stu.getChildren("emp");
        for (Object e: list) {
            org.jdom2.Element element = (org.jdom2.Element)e;
            int empno = Integer.parseInt(element.getChildText("empno"));
            String empname = element.getChildText("ename");
            String job = element.getChildText("job");
            String hiredate = element.getChildText("hiredate");
            String sal = element.getChildText("sal");
            String comm = element.getChildText("comm");
            pstmt = connection.prepareStatement(insertEmp);
            pstmt.setString(1, String.valueOf(empno));
            pstmt.setString(2, empname);
            pstmt.setString(3, job);
            pstmt.setString(4, hiredate);
            pstmt.setString(5, sal);
            pstmt.setString(6, comm);
            pstmt.executeUpdate();
        }
    }

    //    连接数据库
    private static void initializeJdbc() {
        try{
            Class.forName(DRIVER);
            System.out.println("Driver loaded");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected");
        }catch (Exception ignored){}
    }
}
