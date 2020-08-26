public class NonPlayerCharacter extends Character {

  public NonPlayerCharacter(String name, int maxHitPoints, String defaultWeapon) {
    super(name, maxHitPoints, defaultWeapon);
  }

  @Override
  public String getStatus(){
    return "(NPC)\n" + super.getStatus();
  }
}
