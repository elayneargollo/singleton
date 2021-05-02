package factoryjava;

import java.io.File;

import interfaces.IBuilder;
import interfaces.IFactory;
import interfaces.ISyntaxe;
import principal.Singleton;

public class FactoryJava extends Singleton implements IFactory {

	@Override
	public IBuilder createCompiler(File file) {
		return new BuilderJava();
	}

	@Override
	public ISyntaxe create(File file) {
		return new SyntaxeJava();
	}
	
	public static synchronized FactoryJava getInstance() {
		if(instance == null) {
			instance = new FactoryJava();
		}
		return instance;
	}
    
    protected static FactoryJava instance = null;

}
