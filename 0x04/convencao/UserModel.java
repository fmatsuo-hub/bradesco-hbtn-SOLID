// classe User, representando nossa entidade

class UserModel {

    int userId;
    
    String descricao;
    
    final static int IDADE_MINIMA = 18;
    
    // função que coleta todos os users
    
    public List<User> fetchUsers() { return new ArrayList<>(); }
    
    // função que coleta todos os users
    
    public List<User> getAllUsers() { return new ArrayList<>(); }
    
    // função que coleta todos os users
    
    public List<User> getUsers() { return new ArrayList<>(); }

}