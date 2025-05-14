package com.ruby.java.ch05객체;

import java.awt.event.MouseWheelEvent;

public class Box {
	
	/*
	 * class Box {
	    // 필드 (속성)
	    double width;  // 가로
	    double height; // 세로
	    double depth;  // 높이
	    // 부피 계산 메소드
	    double getVolume() {
	        return width * height * depth;
	    }

		// 둘레 길이 계산 메소드
	    double getPerimeter() {
	        
	    }
	    
	    // 박스 크기 조정 (메소드 오버로딩)
	    void resize(double newWidth, double newHeight, double newDepth) {
	        //박스의 가로,세로,높이를 변경
	    }

	    void resize(double scale) {
	        //박스의 가로,세로,높이를 scale 비율로 변경
	    }
	    
	    void show() {
	    	System.out.println("width="+width+ ", height = " + height + ", depth = " + depth);
	    }
	    
	    @Override
	    String toString() {
	       return "width="+width+ ", height = " + height + ", depth = " + depth;
	    }
	 */
	
	//필드
	double width;  // 가로
    double height; // 세로
    double depth;  // 높이
    
    //생성자
    public Box(double width, double height, double depth){
    	this.width=width;
    	this.height=height;
    	this.depth=depth;
    }
    
    //메소드
    // 부피 계산 메소드
    double getVolume() {
        return width * height * depth;
    }
    
    //둘레 길이 계산 메소드
    double getPerimeter() {
    	return width*4+height*4+depth*4;
    }
    
    //박스 크기 조정 : 메소드 오버로딩
    //박스의 가로,세로,높이를 변경
    void resize(double newWidth, double newHeight, double newDepth) {
        this.width = newWidth;
        this.height = newHeight;
        this.depth = newDepth;
    }
    
    //박스의 가로,세로,높이를 scale 비율로 변경
    void resize(double scale) {
    	this.width *= scale;
    	this.height *= scale;
    	this.depth *=scale; 			
    }
    
    //박스의 정보를 출력하는 메소드
    void show() {
    	System.out.println("width="+width+ ", height = " + height + ", depth = " + depth);
    }

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
    
    
}
