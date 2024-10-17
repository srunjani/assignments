class Helloworld {
    public static void main(String args[]) {
        int age=0;
        System.out.println("first name:" + args[0]);
        System.out.println("second name:" + args[1]);
        age = Integer.parseInt(args[2]);
        System.out.println("age:" + age);
    }
}