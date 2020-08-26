
public class Wizard extends Character {
  private int maxMagicPoints;
  private int currentMagicPoints;

  public Wizard(String name, int maxHitPoints, String defaultWeapon, int maxMagicPoints) {
    super(name, maxHitPoints, defaultWeapon);
    this.maxMagicPoints = maxMagicPoints;
    this.currentMagicPoints = maxMagicPoints;
  }

  public void castSpell(int mpCost){
    currentMagicPoints= currentMagicPoints - mpCost;
  }

  @Override
  public void takeDamage(int damageTaken){
    currentHitPoints = currentHitPoints - damageTaken;
    int max = 4;
    int min = 1;
    int range = max - min;
    int rand = (int)(Math.random() * 4) + 1;
    if(rand == 1){
      currentHitPoints = currentHitPoints + damageTaken;
    }


  }

  @Override
  public String getStatus(){
    StringBuilder sb = new StringBuilder();
    sb.append(super.getStatus());
    sb.append("\nMagic Points: ");
    sb.append(currentMagicPoints);
    sb.append(" / ");
    sb.append(maxMagicPoints);
    return sb.toString();
  }
}
