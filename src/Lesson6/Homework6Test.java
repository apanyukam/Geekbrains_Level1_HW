package Lesson6;

/*
HW6
1. Создать классы Собака и Кот с наследованием от класса Животное.

2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
или высоту (для прыжков).

3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
плавание: кот не умеет плавать, собака 10 м.).

4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
(Например, dog1.run(150); -> результат: run: true)

5. Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */

import java.util.Random;

public class Homework6Test {

    public static void main(String[] args) {
        Animal[] participants = prepareParticipants();
        playGame(participants);
    }

    private static Animal[] prepareParticipants() {
        return new Animal[]{
                new Cat(),
                new Dog(),
                new Cat(300, 3),
                new Dog(1000, 2, 100)
        };
    }

    private static void playGame(Animal[] participants) {
        Random random = new Random();

//        System.out.println(random.nextFloat() * 3);

        for (Animal participant : participants) {
            participant.printInfo();
            System.out.println(participant.run(random.nextInt(500)));
            System.out.println(participant.jump(random.nextInt(5)));
            System.out.println(participant.swim(random.nextInt(100)));
            System.out.println();
        }
    }


}
