public class CopyingConstructor {
}
    class Student extends CopyingConstructor{
        int id;
        String name;

        Student(int id, String name){
            this.id=id;
            this.name=name;
        }

        Student(Student s){
            this.id=s.id;
            this.name=s.name;
        }

        void afficher(){
            System.out.println(id + " , " + name);
        }

        public static void main(String[] args){
            Student s1 = new Student(1,"Said");
            Student s2 = new Student(s1);
            s1.afficher();
            s2.afficher();
        }
    }
