import java.util.List;

public class Main {
	public static void main (String[] args) {
			Person p = new Person ("Aminah", 28);
			System.out.println(p.getName());
			
			Book b = new Book("No longer human", "Dazai Osamu", false, 14.49, 176);
			System.out.println(b.getReadTimeMessage());

			Photo photo = new Photo (500, 700, 300, "First family", List.of("Adam", "Eva"));

			System.out.println("Can be printed: " + photo.canBePrinted());
			System.out.println("Is a group picture: " + photo.isGroupPicture());
			
			Television tv = new Television("Samsung", "TV");

			tv.volumeUp();
			tv.setChannel(21);
			tv.setChildLock("1234");
			tv.removeChildLock("1234");

			System.out.println("Current Channel: " + tv.getChannel());
			System.out.println("Current Volume: " + tv.getVolume());
			System.out.println("Child Lock Active: " + tv.isChildLockActive());
			
			LEDStrip strip = new LEDStrip();

			strip.setColor("green");
			System.out.println("Color: " + strip.getColor());

			strip.setDimmer(50);
			System.out.println("Dimmer level: " + strip.getDimmer());

		}
}

