module agenda.fx {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens dev.andrenascimento.agenda.fx to javafx.graphics, javafx.fxml;
}
