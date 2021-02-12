public class Scene{

    private int shotsLeft;
    private Role[] availableRoles; 
  

    Scene(Role[] availableRoles, int shotsLeft ){
        this.availableRoles = availableRoles;
        this.shotsLeft = shotsLeft;
    }

    public void shootScene(int shotsLeft){
        shotsLeft -= 1;
    }

    public castRole(Role role, Player player){
        player.setRole(role);
    }

}