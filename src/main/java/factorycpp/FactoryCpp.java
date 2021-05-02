package factorycpp;

import java.io.File;
import interfaces.IBuilder;
import interfaces.IFactory;
import interfaces.ISyntaxe;
import principal.Singleton;

public class FactoryCpp extends Singleton implements IFactory{

	@Override
	public IBuilder createCompiler(File file) {
		return new BuilderCpp();
	}

	@Override
	public ISyntaxe create(File file) {
		return new SyntaxeCpp();
	}
	
	public static synchronized FactoryCpp getInstance() {
		if(instance == null) {
			instance = new FactoryCpp();
		}
		return instance;
	}
    
    protected static FactoryCpp instance = null;

}
