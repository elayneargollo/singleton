package interfaces;

import java.io.File;

import javax.swing.JFrame;

public interface IFactory {
	abstract IBuilder createCompiler(File file);
	abstract ISyntaxe create(File file);
}
