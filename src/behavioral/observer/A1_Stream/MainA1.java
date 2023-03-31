package behavioral.observer.A1_Stream;

import java.util.List;

public class MainA1 {
    public static void main(String[] args) {
        Stream<List<Course>> stream = new Stream();
        DataAccess dataAccess = new DataAccess(stream);
        Client<List<Course>> client = new Client<List<Course>>(stream){
            @Override
            public void handle(List<Course> courseA1s) {
                for (Course course : courseA1s){
                    System.out.println(course.toString());
                }
            }
        };
        System.out.printf("\nLần 1:\n============================\n");
        dataAccess.add(new Course("C1", "English", 3));
        System.out.printf("\nLần 2:\n============================\n");
        dataAccess.add(new Course("C2", "Math", 3));
        System.out.printf("\nLần 3:\n============================\n");
        dataAccess.add(new Course("C3", "Test", 3));
        System.out.printf("\nLần 4 - Xóa:\n============================\n");
        dataAccess.delete(3);
        System.out.printf("\nLần 5 - Cập nhật:\n============================\n");
        dataAccess.update(2, new Course("C3", "Test", 3));

    }
}
