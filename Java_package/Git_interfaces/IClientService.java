package Git_interfaces;

public interface IClientService {
    void addClient(Client client);
    void removeClient(String clientName);
    Client getClient(String clientName);
}
