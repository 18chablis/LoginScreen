package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private Button cancelBtn;
    @FXML
    private Label loginMsgLabel;
    @FXML
    private ImageView cancelImageView;
    @FXML
    private ImageView padlockImageView;
    @FXML
    private ImageView backgroundImageView;
    @FXML
    private TextField txt_user;
    @FXML
    private PasswordField txt_password;
    @FXML
    private Hyperlink txt_link;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File cancelFile = new File("images/iconfinder_Cancel_728918.png");
        Image cancelImage = new Image(cancelFile.toURI().toString());
        cancelImageView.setImage(cancelImage);

        File padlockFile = new File("images/padlock.png");
        Image padlockImage = new Image(padlockFile.toURI().toString());
        padlockImageView.setImage(padlockImage);

        File backgroundFile = new File("images/af8d63a477078732b79ff9d9fc60873f.jpg");
        Image backgroundImage = new Image(backgroundFile.toURI().toString());
        backgroundImageView.setImage(backgroundImage);
    }

//    public void LoginMsgLabel(){
//       loginMsgLabel.setText("You try to Login");
//    }

    public void BtnLoginAction(ActionEvent event) {

        if(txt_user.getText().isBlank() == false && txt_password.getText().isBlank() == false){
            validateLogin();
        }
        else{
            loginMsgLabel.setText("You try to Login");
        }
    }

    public void BtnRegisterAction(ActionEvent event) {
    }

    public void GobackAction(ActionEvent event) {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }

    public void validateLogin(){

    }
}
