import java.util.ArrayList;
import java.util.List;

public class CityInAmerica implements  Government{
    private List<Citizen> citizenList;
    private String News;
    public CityInAmerica() {
        citizenList = new ArrayList<>();
    }
    public void setNews(String news) {
        this.News = news;
        notifyCitizen();
    }

    @Override
    public void registerCitizen(Citizen citizen) {
        citizenList.add(citizen);
    }

    @Override
    public void removeCitizen(Citizen citizen) {
        citizenList.remove(citizen);
    }

    @Override
    public void notifyCitizen() {
        for (Citizen citizen : citizenList)
            citizen.update(News);
    }
}
