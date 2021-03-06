/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
/*
 * generated by Xtext
 */
package de.sebastianbenz.xgherkin;

import org.eclipse.xtext.conversion.IValueConverterService;

import de.sebastianbenz.xgherkin.conversion.GherkingValueConverter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class GherkinRuntimeModule extends de.sebastianbenz.xgherkin.AbstractGherkinRuntimeModule {

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return GherkingValueConverter.class;
	}
	
}
