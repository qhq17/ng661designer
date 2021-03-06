/**
 * Copyright (c) 2015, 2017 Airbus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.w3._2005._07.scxml.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ScxmlSendTypePropertiesEditionPart {

	/**
	 * @return the event
	 * 
	 */
	public String getEvent();

	/**
	 * Defines a new event
	 * @param newValue the new event to set
	 * 
	 */
	public void setEvent(String newValue);




	/**
	 * Init the param
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initParam(ReferencesTableSettings settings);

	/**
	 * Update the param
	 * @param newValue the param to update
	 * 
	 */
	public void updateParam();

	/**
	 * Adds the given filter to the param edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParam(ViewerFilter filter);

	/**
	 * Adds the given filter to the param edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParam(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the param table
	 * 
	 */
	public boolean isContainedInParamTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
