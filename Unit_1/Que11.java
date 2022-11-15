import java.io.*;

class Dog implements Serializable {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}

class Que11 {
    public static void main(String[] args) {

        // Creates an object of Dog class
        Dog dog = new Dog("Tyson", "Labrador");

        try {
            FileOutputStream file = new FileOutputStream("./buffer.dat.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeObject(dog);
            output.close();

            FileInputStream file1 = new FileInputStream("./buffer.dat.txt");
            ObjectInputStream input = new ObjectInputStream(file1);

            Dog newDog = (Dog) input.readObject();
            System.out.println(newDog.name);
            System.out.println(newDog.breed);
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}