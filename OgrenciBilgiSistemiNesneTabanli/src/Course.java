public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    public Course (String name, String code, String prefix){
        this.name= name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.sozlu=0;
    }
    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher=t;
            System.out.println("Ogretmen atama basarili ogretmeninizin ismi: "+this.courseTeacher);
        }
        else {
            System.out.println("Ogretmen atama basarisiz.");
        }
    }



}
