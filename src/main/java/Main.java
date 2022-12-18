public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder().setName("Ольга").setSurname("Иванова").setAge(29).setAddress("Воронеж").build();

        Person son = mom.newChildBuilder().setName("Антошка").build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // not enough fields
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Age is incorrect
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
