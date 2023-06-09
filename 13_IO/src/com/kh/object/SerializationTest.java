package com.kh.object;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import com.kh.object.model.Person;

public class SerializationTest {

	//직렬화(serialization): 객체를 데이터 스트림으로 만든느 것
	public static void main(String[] args) {
		SerializationTest s = new SerializationTest();
//		s.fileSave();
//		s.fileRead();
		s.objectsSave();
		s.objectsRead();

	}
	public void fileSave() {
		String fileName = "src/person.obj";
		ObjectOutputStream oos = null;
		
		try {
			//1. 스트림 생성
			//FileOutputStream: 파일 출력에 사용되는 기본 바이트 스트림 클래스
			//ObjectOutputStream: 객체 단위로 출력시에 사용되는 보조 바이트 스트림 클래스
			oos = new ObjectOutputStream(new FileOutputStream(fileName));
			
			//2.파일에 저장할 객체 생성
			Person p = new Person("제니",27,"Jennierubyjane");
			
			//3.날린다(파일 정보 저장)
			oos.writeObject(p);
			
			System.out.println("person.obj 파일에 정보 저장"); //-> 출력되면 저장됐다는 것
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//4.자원 반납
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 역직렬화(deserialization):저장된 내용이나 전송받은 내용을 다시 복원하는 것
	public void fileRead() {
		
		//FileInputStream: 파일로부터 데이터를 읽어들이기 위해 사용하는 기본 바이트 스트림 클래스
		//ObjectInputStream: 스트림으로부터 객체 단위로 읽기 위해 사용되는 보조 바이트 스트림 클래스
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/person.obj"))) {	//finally 대신에 try()안에 넣으면 알아서 자원 반납까지
			Person p = (Person)ois.readObject();	// object를 person으로 형변환
			System.out.println(p);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	//여러 객체를 저장
	public void objectsSave() {
		List<Person> list = Arrays.asList(
				new Person("제니",27,"jennierubyjane"),
				new Person("지수",28,"sooyaaa_"),
				new Person("로제",26,"roses_are_rosie"),
				new Person("뷔", 27, "thv"),
				new Person("지민",27,"j.m")
				
				);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/objects.obj"))) {
			for(Person person:list) {
				oos.writeObject(person);
			}
			
			System.out.println("objects.obj 파일에 정보 저장");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//파일에 저장한 데이터 읽기
	public void objectsRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/objects.obj"))) {
			while(true) {
				System.out.println(ois.readObject());
			}
//			ois.readObject()	-> 여러개 불러와서 while문 써도..음..
		} catch (EOFException e) {
			//캐치문 안을 비워놔..
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	
	
}








