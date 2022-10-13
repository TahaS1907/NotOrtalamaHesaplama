public class Course extends Teacher {
    String courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix,String name2, String mpno, String branch) {
      super(name, mpno, branch);
      this.name = name;
      
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
      
    }

    public void addTeacher(String t) {
        if (this.prefix.equals(t)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}