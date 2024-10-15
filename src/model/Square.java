package model;

public class Square extends Rectangle {

	@Override
	public void setWidth(Double width) {
		super.setWidth(width);

		// Para manter a propriedade do quadrado (altura = largura)
		super.setHeight(width);
	}

	@Override
	public void setHeight(Double height) {
		super.setHeight(height);

		// Para manter a propriedade do quadrado (altura = largura)
		super.setWidth(height);
	}
}