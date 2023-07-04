package Test;

public class PrintStudents {
 
  public static void main(String[] args) {
 
    String student1_name = "Joe Smith";
    int student1_id = 111111;
    double student1_gpa = 3.22;
 
    String student2_name = "Alice Merrick";
    int student2_id = 222222;
    double student2_gpa = 2.67;
 
    print_student(student1_name , student1_id, student1_gpa);
    print_student(student2_name, student2_id, student2_gpa);
  }
 
  public static void print_student(String name, int id, double gpa) {
    System.out.printf("The student %s with id %s has gpa = %s\n",
            name, id, gpa
            );
  }
}