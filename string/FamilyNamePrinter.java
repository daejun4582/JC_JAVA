package edu.handong.csee.java.lab07.string;

public class FamilyNamePrinter {
    private String[] stringNames;
    private String[] familyNames;

    public String[] getStringNames() {
        return this.stringNames;
    }

    public void setStringNames(String[] stringNames) {
        this.stringNames = stringNames;
    }

    public String[] getFamilyNames() {
        return this.familyNames;
    }

    public void setFamilyNames(String[] familyNames) {
        this.familyNames = familyNames;
    }

    public FamilyNamePrinter(String names)
    {
        stringNames = names.split(", ");
            

        familyNames = new String[stringNames.length];

        int idx = 0;

        for(String s : getStringNames())
        {   
            familyNames[idx] = s.split(" ")[1];
            idx++;
        }
    }

    public void printFamilyNames()
    {
        for(String s : familyNames)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args) 
    {
        FamilyNamePrinter f = new FamilyNamePrinter(args[0]);
        f.printFamilyNames();
    }
}
