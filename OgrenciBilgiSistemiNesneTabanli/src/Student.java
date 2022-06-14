public class Student {
    String name,stuNo;
    int classes;
    Course mat,fizik,kimya;
    double avarage;
    boolean isPass;

    public Student (String name,int classes, String stuNo, Course mat, Course fizik, Course kimya){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        calcAvarage();
        this.isPass=false;

    }
    public void addBulkExamNote(int mat, int fizik, int kimya){
        if(mat>=0 && mat<=100){
            this.mat.note= mat;
        }
        if(kimya>=0 && kimya<=100){
            this.kimya.note= kimya;
        }
        if(fizik>=0 && fizik<=100){
            this.fizik.note= fizik;
        }
    }
    public void addBulkSozluNote(int mat, int fizik, int kimya){
        if(mat>=0 && mat<=100){
            this.mat.sozlu= mat;
        }
        if(kimya>=0 && kimya<=100){
            this.kimya.sozlu= kimya;
        }
        if(fizik>=0 && fizik<=100){
            this.fizik.sozlu= fizik;
        }
    }
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAvarage() {
        this.avarage = ((this.fizik.note + this.kimya.note + this.mat.note) / 3)*0.8+((this.fizik.sozlu+this.kimya.sozlu+this.mat.sozlu)/3)*0.2;
    }
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sozlu : " + this.mat.sozlu);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu : " + this.fizik.sozlu);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu : " + this.kimya.sozlu);
    }

}
