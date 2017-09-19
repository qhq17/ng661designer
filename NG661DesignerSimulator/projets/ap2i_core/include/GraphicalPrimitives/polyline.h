/*******************************************************************************
* Copyright (c) 2015, 2016 Thales.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* Contributors:
*    Thales Avionics - initial design and implementation
*******************************************************************************/

#ifndef POLYLINE_H
#define POLYLINE_H

#include "basicitem.h"
//#include "datetype.h"
#include "distancetype.h"
#include "positiontype.h"
#include "expressiontype.h"

namespace AP2I
{

class Polyline : public BasicItem
{
    Q_OBJECT
    Q_PROPERTY(StringType points READ points WRITE setPoints)

public:
    explicit Polyline(BasicObject *pParent = 0);
    virtual ~Polyline() {}

    virtual bool    renderIn(RenderingContext &pContext);
    virtual bool    renderOut(RenderingContext &pContext);
    virtual void    initDefaultFields();
    virtual void    createPrimitive(RenderingContext &pContext);
    virtual void    drawPrimitive(RenderingContext &pContext);

    void setPoints(StringType pPoints){mPoints = pPoints; setPointsVector(pPoints);}
    StringType points(){return mPoints;}

    static const char *CLASS_NAME;

private:
    void setPointsVector(StringType pPoints);

    StringType mPoints;
    std::vector<std::string> mPointsVector;
    VGPath mPolylinePath;
};

} /* namespace AP2I */

#endif // POLYLINE_H
