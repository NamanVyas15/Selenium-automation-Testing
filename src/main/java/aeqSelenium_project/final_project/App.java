package aeqSelenium_project.final_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App 
{
    public static void main( String[] args )
    {
    	ChromeDriver ch = new ChromeDriver();
		ch.get("https://www.saucedemo.com/v1/");
		ch.manage().window().maximize();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		ch.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		ch.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
//		login
		ch.findElement(By.className("btn_action")).click();
		
		try {
		Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
//		adding bag to cart
		ch.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}		
//		shopping cart
		ch.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
//		going back
		ch.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
//		adding tshirt
		ch.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")).click();

		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
//		navigating to shopping cart
		ch.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		

		// You can adjust the offset value for different scrolling distances.
//		checking out
		ch.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
//adding name
		ch.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("aryan");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
//		adding surname
		ch.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Srivastav");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
//		adding postal code
		ch.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("411001");
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
//		checkout
		ch.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		
		
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
//		finish
		ch.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
		
		
		
		
		
		
		
		
		
		
    }
}












