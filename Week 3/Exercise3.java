//add class definitions below this line
class Song {
  private String artist;
  private String title;
  private String album;
  private int playCount;
  private final double payRate;
  private double moneyEarned;

  public Song(String a, String t, String al, double pr) {
    artist = a;
    title = t;
    album = al;
    playCount = 0;
    payRate = pr;
    moneyEarned = 0.0;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String newArtist) {
    artist = newArtist;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String newTitle) {
    title = newTitle;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String newAlbum) {
    album = newAlbum;
  }

  public int getPlayCount() {
    return playCount;
  }

  public void setPlayCount(int newPlayCount) {
    playCount = newPlayCount;
  }

  public double getPayRate() {
    return payRate;
  }

  public double getMoneyEarned() {
    return moneyEarned;
  }

  public void play() {
    playCount++;
    moneyEarned += payRate;
  }
}
    

  
//add class definitions above this line

public class CodingExercise3 {
  public static void main(String[] args) {
    
    //add code below this line

    Song mySong = new Song("led zeppelin", "ten years gone", "physical graffiti", 0.001);
    mySong.play();
    System.out.println(mySong.getMoneyEarned());
    for (int i = 0; i < 10000; i++) {
      mySong.play();
    }
    System.out.println(mySong.getMoneyEarned());



    //add code above this line
  }
}
