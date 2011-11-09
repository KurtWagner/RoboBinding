/**
 * AtMethodLevel.java
 * Nov 2, 2011 Copyright Cheng Wei and Robert Taylor
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package robobinding.notifypropertychange;

import robobinding.NotifyPropertyChange;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
public class AtMethodLevel
{
	private boolean property1;
	private boolean property2;
	public AtMethodLevel(boolean property1, boolean property2)
	{
		this.property1 = property1;
		this.property2 = property2;
	}
	public boolean getProperty1()
	{
		return property1;
	}
	@NotifyPropertyChange
	public void setProperty1(boolean newValue)
	{
		property1 = newValue;
	}
	
	public boolean getProperty2()
	{
		return property2;
	}
	public void setProperty2(boolean newValue)
	{
		property2 = newValue;
	}
}
