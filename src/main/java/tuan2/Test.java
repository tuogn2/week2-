package tuan2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream.GetField;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		ParseResult<CompilationUnit> parseResult = null;
		FileInputStream in = new FileInputStream("T:\\JAVA\\tuong2003\\src\\main\\java\\tuan2\\Account.java");
		JavaParser parser =	new  JavaParser();
		parseResult = parser.parse(in);
		Optional<CompilationUnit> optional = parseResult.getResult();
		if(optional.isPresent()) {
			CompilationUnit cu =optional.get();
			getfields(cu);
			System.out.println("===========");
			getMethods(cu);
		}
		
	}
	public static void getfields(CompilationUnit cu) {
		List<FieldDeclaration> fields = cu.findAll(FieldDeclaration.class);
		for(FieldDeclaration file : fields) {
			System.out.println(file);
		}	
	}
	public static void getMethods(CompilationUnit cu) {
		List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);
		for(MethodDeclaration method : methods) {
			System.out.println(method);
		}
	}
}
