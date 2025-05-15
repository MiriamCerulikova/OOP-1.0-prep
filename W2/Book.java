public class Book {
	private String title;
	private String author;
	private boolean hardcover;
	private double price;
	private int numberOfPages;
	private int timesRead;
	
	public Book(String title, String author, boolean hardcover, double price, int numberOfPages) {
		this.title = title;
		this.author = author;
		this.hardcover = hardcover;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.timesRead = 0;
	}
	
		public void read() {
			timesRead++;
		}
		public int getReadTimeInMinutes() {
			return (int) (numberOfPages * 10/8);
		}
		public String getReadTimeMessage() {
			int readTime = getReadTimeInMinutes();
			if (readTime < 61)
				{return "You can read this";}
			else if (readTime < 241)
				{return "Are you sure you want to read this now?";}
			else 
				{return "You should not start reading this right now";}	
		}
		public String getTitle() {
			return title;
			}
		public String getAuthor() {
			return author;
			}
		public boolean isHardcover() {
			return hardcover;
			}
		public double getPrice() {
			return price;
			}
		public int getNumberOfPages() {
			return numberOfPages;
			}
		public int getTimesRead() {
			return timesRead;
			}
		
}