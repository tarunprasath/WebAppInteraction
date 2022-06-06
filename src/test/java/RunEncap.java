public class RunEncap {

    public static void main(String args[])
    {
        EncapTest encap = new EncapTest();
        encap.setName("Arun");
        encap.setAge(20);
        encap.setIdNum("AT113816");
        System.out.print("Name : " + encap.getName() + "\nAge : "+encap.getAge() + "\nID value :"+encap.getIdNum());
    }
}
