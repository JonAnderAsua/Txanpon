package azterketa.ui;

import azterketa.App;
import azterketa.db.TxanponKud;
import azterketa.utils.Txanpona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainKud {

    @FXML
    private TableView<Txanpona> tableId;

    @FXML
    private TableColumn<Txanpona, Integer> idID;

    @FXML
    private TableColumn<Txanpona, String> izenaId;

    @FXML
    private TableColumn<Txanpona, Date> dataId;

    @FXML
    private TableColumn<Txanpona, Float> zenbatId;

    @FXML
    private TableColumn<Txanpona, Float> bolumenId;

    @FXML
    private TableColumn<Txanpona, Image> portaeraId;

    @FXML
    private Button sartuId;

    @FXML
    private Button gordeId;

    @FXML
    private ComboBox<String> comboId;

    @FXML
    private Label labeiId;

    private App app;
    private TxanponKud tx = TxanponKud.getInstance();
    private List<Txanpona> txanponak = new ArrayList<>();

    @FXML
    void gordeClick(ActionEvent event) {
        //Datu basean dauden elementuak ezabatu eta taulan daudenak gorde
    }

    @FXML
    void sartuClick(ActionEvent event) {
        //Txanpon berri bat taulan sartu
    }

    public void setMainApp(App a) {
        this.app=a;
    }

    @FXML
    void initialize() throws SQLException {
        ObservableList<String> txanponMotak = FXCollections.observableArrayList();;
        txanponMotak.addAll("BTC","ETH");
        comboId.setItems(txanponMotak);

        txanponak = tx.getTxanponak();

        idID.setCellValueFactory(new PropertyValueFactory<>("id"));
        izenaId.setCellValueFactory(new PropertyValueFactory<>("izena"));
        dataId.setCellValueFactory(new PropertyValueFactory<>("data"));
        zenbatId.setCellValueFactory(new PropertyValueFactory<>("balioa"));
        bolumenId.setCellValueFactory(new PropertyValueFactory<>("bolumena"));
        portaeraId.setCellValueFactory(new PropertyValueFactory<>("joera"));


    }
}
