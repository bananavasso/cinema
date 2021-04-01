import java.util.ArrayList;

public class AllStaff {

        private ArrayList<Staff> arrayStaff = new ArrayList<>();;


        public ArrayList ReturnsAnArrList(){
                return arrayStaff;
        }

        public void add(Staff assistant) {
            arrayStaff.add(assistant);
        }


}
