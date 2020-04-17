package srpfacadelab;

public class Facade {

    private IGameEngine gameEngine;

    private ItemActions itemActions;

    private DamageActions damageActions;

    public Facade(IGameEngine gameEngine)
    {
        this.gameEngine = gameEngine;
        this.itemActions = new ItemActions(gameEngine);
        this.damageActions = new damageActions(gameEngine);
    }

    public void useItem(Item item, RpgPlayer player)
    {
        this.itemActions.useItem(item, player);
    }

    public boolean pickUpItem(Item item, RpgPlayer player)
    {
        return this.itemActions.pickUpItem(item, player);
    }

    public void takeDamage(int damage, RpgPlayer player)
    {
        this.damageActions.takeDamage(damage, player);
    }



}