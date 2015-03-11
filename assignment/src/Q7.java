///**
// * Created by steven on 2/1/15.
// */
//public class Q7 {
//    assign3point7.ListNode<Animal> dogs = new ListNodeDemo.Node<Animal>();
//    assign3point7.ListNode<Animal> cats = new ListNodeDemo.Node<Animal>();
//    int time = 0;
//    enum Type {CAT, DOG}
//
//    class Animal {
//        Type type;
//        String name;
//        int timestamp;
//
//        public Animal(Type type, String name) {
//            this.type = type;
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return type + ": " + name;
//        }
//    }
//
//    void enqueue(Animal a) {
//        a.timestamp = ++time;
//        switch (a.type) {
//            case CAT: cats.add(a); break;// XXX: break!
//            case DOG: dogs.dogs(a); break;
//        }
//    }
//
//    Animal dequeueDog() {
//        if (dogs.isEmpty())
//            throw new IllegalStateException("No dogs!");
//        return dogs.removeFirst();
//    }
//
//    Animal dequeueCat() {
//        if (cats.isEmpty())
//            throw new IllegalStateException("No cats!");
//        return cats.removeFirst();
//    }
//
//    Animal dequeueAny() {
//        if (dogs.isEmpty() && cats.isEmpty())
//            throw new IllegalStateException("No animals!");
//        else if (dogs.isEmpty())
//            return dequeueCat();
//        else if (cats.isEmpty())
//            return dequeueDog();
//        else if (dogs.getFirst().timestamp < cats.getFirst().timestamp)
//            return dequeueDog();
//        else
//            return dequeueCat();
//    }
//
//    //-------------------------------------------------
//    public static void main(String[]args) {
//        Q7 q = new Q7(); /* AnimalQueue */
//        q.enqueue(q.new Animal(Type.CAT, "lily"));
//        q.enqueue(q.new Animal(Type.DOG, "tom"));
//        q.enqueue(q.new Animal(Type.DOG, "peter"));
//        q.enqueue(q.new Animal(Type.CAT, "john"));
//
//        System.out.println(q.dequeueAny());
//        System.out.println(q.dequeueCat());
//        System.out.println(q.dequeueAny());
//        q.enqueue(q.new Animal(Type.DOG, "tom"));
//        System.out.println(q.dequeueDog());
//        System.out.println(q.dequeueAny());
//    }
//}
