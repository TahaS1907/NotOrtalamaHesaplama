class Main {
  public static void main(String[] args) {
    Course mat = new Course("Matematik", "MAT101", "MAT","Mahmut Hoca", "90550000000", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK","Fatma Ayşe", "90550000001", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY","Ali Veli", "90550000002", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        

        Student s1 = new Student("İnek Şaban", 4, "140144015", 50, 20, 40);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", 100, 50, 40);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", 50, 20, 40);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

  }
}