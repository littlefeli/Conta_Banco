module com.example.desafio_banco_sintaxe {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.desafio_banco_sintaxe to javafx.fxml;
    exports com.example.desafio_banco_sintaxe;
}