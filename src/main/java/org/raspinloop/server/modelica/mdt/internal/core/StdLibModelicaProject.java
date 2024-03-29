package org.raspinloop.server.modelica.mdt.internal.core;

import java.nio.file.Path;
import java.util.Collection;

import javax.annotation.Resource;

import org.openmodelica.corba.ConnectException;
import org.raspinloop.server.modelica.mdt.core.IDefinitionLocation;
import org.raspinloop.server.modelica.mdt.core.IMoClassLoader;
import org.raspinloop.server.modelica.mdt.core.IModelicaClass;
import org.raspinloop.server.modelica.mdt.core.IModelicaElement;
import org.raspinloop.server.modelica.mdt.core.IModelicaProject;
import org.raspinloop.server.modelica.mdt.core.IStandardLibrary;
import org.raspinloop.server.modelica.mdt.core.compiler.CompilerInstantiationException;
import org.raspinloop.server.modelica.mdt.core.compiler.InvocationError;
import org.raspinloop.server.modelica.mdt.core.compiler.UnexpectedReplyException;

public class StdLibModelicaProject implements IModelicaProject {

	@Resource
	IStandardLibrary std;
	
	public StdLibModelicaProject(){
		super();		
	}

	@Override
	public Visibility getVisibility() {
		return null;
	}

	@Override
	public String getElementName() {
		return null;
	}

	@Override
	public String getFullName() {
		return "";
	}

	@Override
	public IDefinitionLocation getLocation() throws ConnectException, UnexpectedReplyException, InvocationError, CompilerInstantiationException {
		return null;
	}

	@Override
	public String getFilePath() throws ConnectException, UnexpectedReplyException, InvocationError, CompilerInstantiationException {
		return null;
	}

	@Override
	public IModelicaElement getParent() {
		return null;
	}

	@Override
	public IModelicaProject getProject() {
		return this;
	}

	@Override
	public String getDocumentation() throws ConnectException, UnexpectedReplyException, InvocationError, CompilerInstantiationException {
		return null;
	}

	@Override
	public IMoClassLoader getMoClassLoader() {
		return std.getMoClassLoader();
	}

	@Override
	public IModelicaClass getClass(String className) throws ConnectException, CompilerInstantiationException, UnexpectedReplyException, InvocationError {
		return getRootClasses().stream()
		.map(IModelicaClass.class::cast)
		.filter(c -> c.getFullName().equals(className))
		.findFirst()
		.orElse(std.getMoClassLoader().getClass(className));
	}

	@Override
	public Collection<? extends IModelicaClass> getRootClasses() throws ConnectException, CompilerInstantiationException, UnexpectedReplyException {
		return std.getPackages();
	}

	@Override
	public IModelicaElement findElement(Path resourcePath) throws ConnectException, UnexpectedReplyException, CompilerInstantiationException, InvocationError {
		return null;
	}

	@Override
	public String getIconAnnotation() {
		// TODO Auto-generated method stub
		return null;
	}

}
