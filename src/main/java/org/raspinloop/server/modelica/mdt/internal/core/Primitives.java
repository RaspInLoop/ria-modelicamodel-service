package org.raspinloop.server.modelica.mdt.internal.core;

import java.util.Collection;
import java.util.Collections;

import org.openmodelica.corba.ConnectException;
import org.raspinloop.server.modelica.mdt.core.IDefinitionLocation;
import org.raspinloop.server.modelica.mdt.core.IMoClassLoader;
import org.raspinloop.server.modelica.mdt.core.IModelicaClass;
import org.raspinloop.server.modelica.mdt.core.IModelicaElement;
import org.raspinloop.server.modelica.mdt.core.IModelicaExtends;
import org.raspinloop.server.modelica.mdt.core.IModelicaImport;
import org.raspinloop.server.modelica.mdt.core.IModelicaProject;
import org.raspinloop.server.modelica.mdt.core.ISignature;
import org.raspinloop.server.modelica.mdt.core.compiler.CompilerInstantiationException;
import org.raspinloop.server.modelica.mdt.core.compiler.InvocationError;
import org.raspinloop.server.modelica.mdt.core.compiler.UnexpectedReplyException;

public class Primitives {

	public static IModelicaClass create(String className) {		
		return new Primitives.InnerPrimitive(className);
	}

	static class  InnerPrimitive implements IModelicaClass {

		private String typeName;

		
		public InnerPrimitive(String typeName) {
			super();
			this.typeName = typeName;
		}

		@Override
		public Visibility getVisibility() {
			return Visibility.NONE;
		}

		@Override
		public String getElementName() {
			
			return typeName;
		}

		@Override
		public String getFullName() {
			return typeName;
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
			return null;
		}

		@Override
		public String getDocumentation() throws ConnectException, UnexpectedReplyException, InvocationError, CompilerInstantiationException {
			return null;
		}

		@Override
		public IMoClassLoader getMoClassLoader() {
			return null;
		}

		@Override
		public Collection<? extends IModelicaElement> getChildren()
				throws ConnectException, UnexpectedReplyException, InvocationError, CompilerInstantiationException {
			return Collections.emptyList();
		}

		@Override
		public boolean hasChildren() throws ConnectException, UnexpectedReplyException, InvocationError, CompilerInstantiationException {
			return false;
		}

		@Override
		public String getPrefix() {
			return "";
		}

		@Override
		public Restriction getRestriction() throws ConnectException, CompilerInstantiationException, UnexpectedReplyException, InvocationError {
			return Restriction.TYPE;
		}

		@Override
		public Collection<IModelicaImport> getImports() throws ConnectException, UnexpectedReplyException, InvocationError, CompilerInstantiationException {
			return Collections.emptyList();
		}

		@Override
		public Collection<IModelicaExtends> getExtends() throws ConnectException, UnexpectedReplyException, InvocationError, CompilerInstantiationException {
			return Collections.emptyList();
		}

		@Override
		public IModelicaClass getParentNamespace() {		
			return null;
		}

		@Override
		public ISignature getSignature() throws ConnectException, InvocationError, UnexpectedReplyException, CompilerInstantiationException {	
			return null;
		}

		@Override
		public boolean isEncapsulated() throws CompilerInstantiationException, ConnectException, UnexpectedReplyException, InvocationError {
			return false;
		}

		@Override
		public boolean isConnector(){
			return false;
		}

		@Override
		public Collection<IModelicaClass> getInheritedClasses()
				throws ConnectException, UnexpectedReplyException, InvocationError, CompilerInstantiationException {
			return Collections.emptyList();
		}

		@Override
		public String getIconAnnotation() {
			// TODO generate Icon based on Type
			return "";
		}

		@Override
		public String getDiagramAnnotation() {
			// TODO Auto-generated method stub
			return "";
		}
		
	}
}
