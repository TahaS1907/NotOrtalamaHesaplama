public class Student {
    String name,stuNo;
    int classes;
    double mat;
    double fizik;
    double kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, double mat,double fizik,double kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya = kimya;
        }

    }

    public void isPass() {
        if (this.mat == 0 || this.fizik == 0 || this.kimya == 0) {
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
        this.avarage = (this.fizik + this.kimya+ this.mat) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat);
        System.out.println("Fizik Notu : " + this.fizik);
        System.out.println("Kimya Notu : " + this.kimya);
    }

}