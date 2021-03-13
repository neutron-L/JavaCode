package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {
    private String endStr;
    private ArrayList<Entry> files = new ArrayList<>();

    public FileFindVisitor(String endStr) {
        this.endStr = endStr;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(endStr))
            files.add(file);
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }

    public Iterator getFoundFiles() {
        return files.iterator();
    }
}
