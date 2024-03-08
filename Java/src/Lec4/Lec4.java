public class Lec4 {

    public static void main(String[] args){
        int StudentMarks[] = {56,35,94,64,77};
        System.out.println(StudentMarks[0] + " " +StudentMarks[3]);
        StudentMarks[3] = 70;
        for (int i = 0 ; i<StudentMarks.length; i++){
            System.out.println(StudentMarks[i]);
        }
        try{
            StudentMarks[6] = 14;
        }
        catch(Exception e){
            System.out.println("Array is not a dynamic array.");
        }

        int[] FinalSD2Marks = StudentMarks;

        for (int tempElement : FinalSD2Marks){
            System.out.println(tempElement);
        }
    }
}

