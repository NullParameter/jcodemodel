/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.helger.jcodemodel;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;

/**
 * Represents an arrays as annotation members
 * <p>
 * This class implements {@link IJAnnotatable} to allow new annotations to be
 * added as a member of the array.
 *
 * @author Bhakti Mehta (bhakti.mehta@sun.com)
 */
public class JAnnotationArrayMember extends AbstractJAnnotationValueOwned implements IJAnnotatable
{
  private final List <AbstractJAnnotationValue> _values = new ArrayList <AbstractJAnnotationValue> ();
  private final JCodeModel _owner;

  public JAnnotationArrayMember (@Nonnull final JCodeModel owner)
  {
    if (owner == null)
      throw new NullPointerException ("owner");
    _owner = owner;
  }

  @Nonnull
  public JCodeModel owner ()
  {
    return _owner;
  }

  /**
   * Adds an array member to this annotation
   *
   * @param value
   *        Adds a string value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final String value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (JExpr.lit (value));
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds an array member to this annotation
   *
   * @param value
   *        Adds a boolean value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final boolean value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (JExpr.lit (value));
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds an array member to this annotation
   *
   * @param value
   *        Adds a byte value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final byte value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (JExpr.lit (value));
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds an array member to this annotation
   *
   * @param value
   *        Adds a char value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final char value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (JExpr.lit (value));
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds an array member to this annotation
   *
   * @param value
   *        Adds a double value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final double value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (JExpr.lit (value));
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds an array member to this annotation
   *
   * @param value
   *        Adds a long value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final long value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (JExpr.lit (value));
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds an array member to this annotation
   *
   * @param value
   *        Adds a short value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final short value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (JExpr.lit (value));
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds an array member to this annotation
   *
   * @param value
   *        Adds an int value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final int value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (JExpr.lit (value));
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds an array member to this annotation
   *
   * @param value
   *        Adds a float value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final float value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (JExpr.lit (value));
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds a enum array member to this annotation
   *
   * @param value
   *        Adds a enum value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final Enum <?> value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationEnumValue (value);
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds a enum array member to this annotation
   *
   * @param value
   *        Adds a enum value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final JEnumConstant value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (value);
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds an expression array member to this annotation
   *
   * @param value
   *        Adds an expression value to the array member
   * @return The JAnnotationArrayMember. More elements can be added by calling
   *         the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final IJExpression value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (value);
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds a class array member to this annotation
   *
   * @param value
   *        Adds a class value to the array member
   * @return The {@link JAnnotationArrayMember}. More elements can be added by
   *         calling the same method multiple times
   */
  @Nonnull
  public JAnnotationArrayMember param (final Class <?> value)
  {
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (new FullClassNameExpr (value));
    _values.add (annotationValue);
    return this;
  }

  @Nonnull
  public JAnnotationArrayMember param (final AbstractJType type)
  {
    final AbstractJClass clazz = type.boxify ();
    final AbstractJAnnotationValue annotationValue = new JAnnotationStringValue (clazz.dotclass ());
    _values.add (annotationValue);
    return this;
  }

  /**
   * Adds a new annotation to the array.
   */
  @Nonnull
  public JAnnotationUse annotate (@Nonnull final Class <? extends Annotation> clazz)
  {
    return annotate (_owner.ref (clazz));
  }

  /**
   * Adds a new annotation to the array.
   */
  @Nonnull
  public JAnnotationUse annotate (@Nonnull final AbstractJClass clazz)
  {
    final JAnnotationUse a = new JAnnotationUse (clazz);
    _values.add (a);
    return a;
  }

  @Nonnull
  public <W extends IJAnnotationWriter <?>> W annotate2 (@Nonnull final Class <W> clazz)
  {
    return TypedAnnotationWriter.create (clazz, this);
  }

  /**
   * {@link IJAnnotatable#annotations()}
   *
   * @see #getAllAnnotations()
   */
  @SuppressWarnings ({ "unchecked", "rawtypes" })
  @Nonnull
  public Collection <JAnnotationUse> annotations ()
  {
    // FIXME this invocation is invalid if the caller isn't adding annotations
    // into an array so this potentially type-unsafe conversion would be
    // justified.
    return Collections.<JAnnotationUse> unmodifiableList ((List) _values);
  }

  @Nonnull
  public Collection <AbstractJAnnotationValue> getAllAnnotations ()
  {
    return Collections.unmodifiableList (_values);
  }

  public void generate (@Nonnull final JFormatter f)
  {
    f.print ('{').newline ().indent ();
    boolean first = true;
    for (final AbstractJAnnotationValue aValue : _values)
    {
      if (!first)
        f.print (',').newline ();
      f.generable (aValue);
      first = false;
    }
    f.newline ().outdent ().print ('}');
  }
}
