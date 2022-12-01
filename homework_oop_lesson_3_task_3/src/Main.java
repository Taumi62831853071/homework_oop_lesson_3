import animal.amphibian.Amphibian;
import animal.bird.Bird;
import animal.mammal.Mammal;

public abstract class Main {
    public static void main(String[] args) {

        Mammal.Herbivore gazelle = new Mammal.Herbivore("Газель",1,"Полупустыни и пустыни",50,"Трава, листья и молодые ветки кустарников");
        Mammal.Herbivore giraffe = new Mammal.Herbivore("Жираф",2,"Тропические степи с редкорастущими деревьями",55,"Листья, цветы, семена, фрукты");
        Mammal.Herbivore horse = new Mammal.Herbivore("Лошадь",3,"",25,"Трава, фрукты, овощи, листья, корни, злаки");

        printInfoHerbivore(gazelle);
        gazelle.eat();
        gazelle.sleep();
        gazelle.move();
        gazelle.walk();
        gazelle.graze();
        System.out.println(gazelle.equals(giraffe) || gazelle.equals(horse));
        printInfoHerbivore(giraffe);
        giraffe.eat();
        giraffe.sleep();
        giraffe.move();
        giraffe.walk();
        giraffe.graze();
        System.out.println(giraffe.equals(gazelle) || giraffe.equals(horse));
        printInfoHerbivore(horse);
        horse.eat();
        horse.sleep();
        horse.move();
        horse.walk();
        horse.graze();
        System.out.println(horse.equals(giraffe) || horse.equals(gazelle));
        Mammal.Predator hyena = new Mammal.Predator("Гиена",4,"Африка",60,"Мелкие позвоночные");
        Mammal.Predator tiger = new Mammal.Predator("Тигр",5,"Влажные тропические леса, мангровые болота, бамбуковые чащи в тропиках, сухие саванны, полупустыни, голые каменистые сопки и тайга на севере",60,"Копытные");
        Mammal.Predator bear = new Mammal.Predator("Медведь",6,"От степей до высокогорий, от лесов до арктических льдов",50,"");

        printInfoMammal(hyena);
        hyena.eat();
        hyena.sleep();
        hyena.move();
        hyena.walk();
        hyena.hunt();
        System.out.println(hyena.equals(tiger) || hyena.equals(bear));
        printInfoMammal(tiger);
        tiger.eat();
        tiger.sleep();
        tiger.move();
        tiger.walk();
        tiger.hunt();
        System.out.println(tiger.equals(hyena) || tiger.equals(bear));
        printInfoMammal(bear);
        bear.eat();
        bear.sleep();
        bear.move();
        bear.walk();
        bear.hunt();
        System.out.println(bear.equals(hyena) || bear.equals(tiger));
        Amphibian frog = new Amphibian("Лягушка",0,"Пресноводные водоёмы, кроны деревьев, подземные норы");
        Amphibian alreadyFreshwater = new Amphibian("Уж пресноводный", 0,"От Средней и Южной Европы до Западного Китая и Северо-Западной Индии");

        printInfoAmphibian(frog);
        frog.eat();
        frog.sleep();
        frog.move();
        frog.hunt();
        System.out.println(frog.equals(alreadyFreshwater));
        printInfoAmphibian(alreadyFreshwater);
        alreadyFreshwater.eat();
        alreadyFreshwater.sleep();
        alreadyFreshwater.move();
        alreadyFreshwater.hunt();
        System.out.println(alreadyFreshwater.equals(frog));
        Bird.Flightless peacock = new Bird.Flightless("Павлин",2, "Леса и саванны, на полуострове Индостан и на острове Цейлон","Ходьба");
        Bird.Flightless penguin = new Bird.Flightless("Пингвин",1, "Открытое море Южного полушария: в прибрежных водах Антарктики, Новой Зеландии, южной части Австралии, Южной Африке, по всему западному побережью Южной Америки","Ходьба, плавание");
        Bird.Flightless dodo = new Bird.Flightless("Птица Додо",0, "","Ходьба");

        printInfoBird(peacock);
        peacock.eat();
        peacock.sleep();
        peacock.move();
        peacock.hunt();
        peacock.walk();
        System.out.println(peacock.equals(penguin) || peacock.equals(dodo));
        printInfoBird(penguin);
        penguin.eat();
        penguin.sleep();
        penguin.move();
        penguin.hunt();
        penguin.walk();
        System.out.println(penguin.equals(peacock) || penguin.equals(dodo));
        printInfoBird(dodo);
        dodo.eat();
        dodo.sleep();
        dodo.move();
        dodo.hunt();
        dodo.walk();
        System.out.println(dodo.equals(peacock) || dodo.equals(penguin));
        Bird.Flying seagull = new Bird.Flying("Чайка",1, "Везде, где есть открытый выход к морю или океану","Полёт");
        Bird.Flying albatross = new Bird.Flying("Альбатрос",2, "Ледяные воды Антарктиды и и вообще всё Южное полушарие","Полёт");
        Bird.Flying falcon = new Bird.Flying("Сокол",3, "пустыни, тундры, тайга, луга, саванны, кустарниковые леса, горах, прибрежных районы, водно-болотные угодья, устья рек, берега озер, сельскохозяйственные районы, пригороды и города","Полёт");

        printInfoBird(seagull);
        seagull.eat();
        seagull.sleep();
        seagull.move();
        seagull.hunt();
        seagull.fly();
        System.out.println(seagull.equals(albatross) || seagull.equals(falcon));
        printInfoBird(albatross);
        albatross.eat();
        albatross.sleep();
        albatross.move();
        albatross.hunt();
        albatross.fly();
        System.out.println(albatross.equals(seagull) || albatross.equals(falcon));
        printInfoBird(falcon);
        falcon.eat();
        falcon.sleep();
        falcon.move();
        falcon.hunt();
        falcon.fly();
        System.out.println(falcon.equals(seagull) || falcon.equals(albatross));
    }


    private static void printInfoHerbivore(Mammal.Herbivore mammal) {
        System.out.println(mammal.name + ", колличество лет: " + mammal.age + ", среда обитания: " + mammal.habitat + ", скорость: " + mammal.speed + " км/ч, тип пищи: " + mammal.foodType);
    }

    private static void printInfoMammal(Mammal.Predator mammal) {
        System.out.println(mammal.name + ", колличество лет: " + mammal.age + ", среда обитания: " + mammal.habitat + ", скорость: " + mammal.speed + " км/ч, тип пищи: " + mammal.foodType);
    }

    private static void printInfoAmphibian(Amphibian amphibian) {
        System.out.println(amphibian.name + ", колличество лет: " + amphibian.age + ", среда обитания: " + amphibian.habitat);
    }

    private static void printInfoBird(Bird.Flightless bird) {
        System.out.println(bird.name + ", колличество лет: " + bird.age + ", среда обитания: " + bird.habitat + " , тип передвижения: " + bird.movementType);
    }

    private static void printInfoBird(Bird.Flying bird) {
        System.out.println(bird.name + ", колличество лет: " + bird.age + ", среда обитания: " + bird.habitat + " , тип передвижения: " + bird.movementType);
    }

}