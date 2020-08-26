import java.util.ArrayList;

public class Character {
  private String name;
  private int maxHitPoints;
  protected int currentHitPoints;
  private String defaultWeapon;
  private boolean isAlive;

  public Character(String name, int maxHitPoints, String defaultWeapon) {
    this.name = name;
    this.maxHitPoints = maxHitPoints;
    this.defaultWeapon = defaultWeapon;
    this.currentHitPoints = maxHitPoints;
    this.isAlive = true;
  }

  public String getStatus(){
    StringBuilder sb = new StringBuilder();
    sb.append("Name: ");
    sb.append(name);
    sb.append("\n");
    sb.append("Hit Points: ");
    sb.append(currentHitPoints);
    sb.append(" / ");
    sb.append(maxHitPoints);
    sb.append("\n Alive?: ");
    sb.append(isAlive);
    return sb.toString();
  }

  public void takeDamage(int damageTaken){
    currentHitPoints = currentHitPoints - damageTaken;
    if(currentHitPoints < 1){
      currentHitPoints = 0;
      isAlive = false;
    }
  }

  public static void main(String[] args) {
    Character hectorInspector = new Character("Hector the Inspector", 404, "Red Squiggles");
    Character charizard = new Character("Charizard", 120, "Flamethrower");
    NonPlayerCharacter professorOak = new NonPlayerCharacter("Professor Oak", 10, "Speech");
    Wizard morganFreeman = new Wizard("Morgan Freeman", 1000000, "Wit", 42);

    morganFreeman.takeDamage(500000);
    morganFreeman.castSpell(10);
    professorOak.takeDamage(100);

    ArrayList<Character> party = new ArrayList<>();
    party.add(hectorInspector);
    party.add(charizard);
    party.add(professorOak);
    party.add(morganFreeman);

    StringBuilder sb = new StringBuilder();
    for(Character character : party){
      sb.append(character.getStatus());
      sb.append("\n\n");
    }
    System.out.println(sb.toString());
  }
}
