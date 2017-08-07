package io.pivotal;

import com.vaadin.annotations.Theme;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import io.pivotal.domain.City;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

@SpringUI
@Theme("valo")
public class AppUI extends UI {

    private final CloudNativeSpringUiApplication.CityClient _client;
    private final Grid<City> _grid;

    @Autowired
    public AppUI(CloudNativeSpringUiApplication.CityClient client) {
        _client = client;
        _grid = new Grid<>(City.class);
    }

    @Override
    protected void init(VaadinRequest request) {
        setContent(_grid);
        _grid.setWidth(100, Unit.PERCENTAGE);
        _grid.setHeight(100, Unit.PERCENTAGE);
        Collection<City> collection = new ArrayList<>();
        _client.getCities().forEach(collection::add);
        _grid.setItems(collection);
    }
}