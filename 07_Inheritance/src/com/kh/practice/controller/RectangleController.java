package com.kh.practice.controller;

import com.kh.practice.model.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int height, int width) {
		//면적 : 너비 * 높이
		r.setX(x);					// 정보를 넘겨야..!
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return r.draw() + " / " + width * height;			// 일단""입력하면 숫자가 문자열로 인식이 돼

	}
	
	public String CalcPerimeter(int x, int y, int height, int width) {
		// 둘레 : 2 * (너비 +높이)
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return r.draw() + " / "  + 2 * (width + height);
	}
}