/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoFactoryImpl extends EFactoryImpl implements GoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GoFactory init()
  {
    try
    {
      GoFactory theGoFactory = (GoFactory)EPackage.Registry.INSTANCE.getEFactory(GoPackage.eNS_URI);
      if (theGoFactory != null)
      {
        return theGoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GoPackage.SOUCE_FILE: return createSouceFile();
      case GoPackage.TYPE: return createType();
      case GoPackage.TYPE_NAME: return createTypeName();
      case GoPackage.TYPE_NAME_LINHA: return createTypeNameLinha();
      case GoPackage.TYPE_LIT: return createTypeLit();
      case GoPackage.TYPE_LIT_LINHA: return createTypeLitLinha();
      case GoPackage.ARRAY_LENGTH: return createArrayLength();
      case GoPackage.ELEMENT_TYPE: return createElementType();
      case GoPackage.STRUCT_TYPE: return createStructType();
      case GoPackage.FIELD_DECL: return createFieldDecl();
      case GoPackage.EMBEDDED_FIELD: return createEmbeddedField();
      case GoPackage.TAG: return createTag();
      case GoPackage.POINTER_TYPE: return createPointerType();
      case GoPackage.FUNCTION_TYPE: return createFunctionType();
      case GoPackage.SIGNATURE: return createSignature();
      case GoPackage.RESULT: return createResult();
      case GoPackage.PARAMETERS: return createParameters();
      case GoPackage.PARAMETER_LIST: return createParameterList();
      case GoPackage.PARAMETER_DECL: return createParameterDecl();
      case GoPackage.INTERFACE_TYPE: return createInterfaceType();
      case GoPackage.METHOD_SPEC: return createMethodSpec();
      case GoPackage.METHOD_NAME: return createMethodName();
      case GoPackage.INTERFACE_TYPE_NAME: return createInterfaceTypeName();
      case GoPackage.MAP_TYPE: return createMapType();
      case GoPackage.KEY_TYPE: return createKeyType();
      case GoPackage.CHANNEL_TYPE: return createChannelType();
      case GoPackage.BLOCK: return createBlock();
      case GoPackage.STATEMENT_LIST: return createStatementList();
      case GoPackage.DECLARATION: return createDeclaration();
      case GoPackage.TOP_LEVEL_DECL: return createTopLevelDecl();
      case GoPackage.TOP_LEVEL_DECL_LINHA: return createtopLevelDeclLinha();
      case GoPackage.CONST_DECL: return createConstDecl();
      case GoPackage.CONST_SPEC: return createConstSpec();
      case GoPackage.IDENTIFIER_LIST: return createIdentifierList();
      case GoPackage.EXPRESSION_LIST: return createExpressionList();
      case GoPackage.TYPE_DECL: return createTypeDecl();
      case GoPackage.TYPE_SPEC: return createTypeSpec();
      case GoPackage.ALIAS_DECL: return createAliasDecl();
      case GoPackage.TYPE_DEF: return createTypeDef();
      case GoPackage.VAR_DECL: return createVarDecl();
      case GoPackage.VAR_SPEC: return createVarSpec();
      case GoPackage.SHORT_VAR_DECL: return createShortVarDecl();
      case GoPackage.FUNCTION_DECL: return createFunctionDecl();
      case GoPackage.FUNCTION_NAME: return createFunctionName();
      case GoPackage.FUNCTION_BODY: return createFunctionBody();
      case GoPackage.METHOD_DECL: return createMethodDecl();
      case GoPackage.RECEIVER: return createReceiver();
      case GoPackage.OPERAND: return createOperand();
      case GoPackage.LITERAL: return createLiteral();
      case GoPackage.BASIC_LIT: return createBasicLit();
      case GoPackage.OPERAND_NAME: return createOperandName();
      case GoPackage.QUALIFIED_IDENT: return createQualifiedIdent();
      case GoPackage.COMPOSITE_LIT: return createCompositeLit();
      case GoPackage.LITERAL_TYPE: return createLiteralType();
      case GoPackage.LITERAL_TYPE_LINHA: return createLiteralTypeLinha();
      case GoPackage.LITERAL_VALUE: return createLiteralValue();
      case GoPackage.ELEMENT_LIST: return createElementList();
      case GoPackage.ELEMENT: return createElement();
      case GoPackage.KEYED_ELEMENT: return createKeyedElement();
      case GoPackage.KEY: return createKey();
      case GoPackage.FIELD_NAME: return createFieldName();
      case GoPackage.FUNCTION_LIT: return createFunctionLit();
      case GoPackage.PRIMARY_EXPR: return createPrimaryExpr();
      case GoPackage.PRIMARY_EXPR_LINHA: return createPrimaryExprLinha();
      case GoPackage.PONTO: return createponto();
      case GoPackage.COCHETES: return createcochetes();
      case GoPackage.SELECTOR: return createSelector();
      case GoPackage.INDEX: return createIndex();
      case GoPackage.SLICE: return createSlice();
      case GoPackage.TYPE_ASSERTION: return createTypeAssertion();
      case GoPackage.ARGUMENTS: return createArguments();
      case GoPackage.METHOD_EXPR: return createMethodExpr();
      case GoPackage.RECEIVER_TYPE: return createReceiverType();
      case GoPackage.EXPRESSION: return createExpression();
      case GoPackage.EXPRESSION_LINHA: return createExpressionLinha();
      case GoPackage.UNARY_EXPR: return createUnaryExpr();
      case GoPackage.BINARY_OP: return createbinary_op();
      case GoPackage.CONVERSION: return createConversion();
      case GoPackage.STATEMENT: return createStatement();
      case GoPackage.SIMPLE_STMT: return createSimpleStmt();
      case GoPackage.LABELED_STMT: return createLabeledStmt();
      case GoPackage.LABEL: return createLabel();
      case GoPackage.EXPRESSION_STMT: return createExpressionStmt();
      case GoPackage.SEND_STMT: return createSendStmt();
      case GoPackage.CHANNEL: return createChannel();
      case GoPackage.INC_DEC_STMT: return createIncDecStmt();
      case GoPackage.ASSIGNMENT: return createAssignment();
      case GoPackage.IF_STMT: return createIfStmt();
      case GoPackage.SWITCH_STMT: return createSwitchStmt();
      case GoPackage.EXPR_CASE_CLAUSE: return createExprCaseClause();
      case GoPackage.EXPR_SWITCH_CASE: return createExprSwitchCase();
      case GoPackage.SWITCH_STMT_LINHA: return createswitch_stmt_linha();
      case GoPackage.TYPE_SWITCH_GUARD: return createTypeSwitchGuard();
      case GoPackage.TYPE_CASE_CLAUSE: return createTypeCaseClause();
      case GoPackage.TYPE_SWITCH_CASE: return createTypeSwitchCase();
      case GoPackage.TYPE_LIST: return createTypeList();
      case GoPackage.FOR_STMT: return createForStmt();
      case GoPackage.CONDITION: return createCondition();
      case GoPackage.FOR_CLAUSE: return createForClause();
      case GoPackage.INIT_STMT: return createInitStmt();
      case GoPackage.POST_STMT: return createPostStmt();
      case GoPackage.RANGE_CLAUSE: return createRangeClause();
      case GoPackage.GO_STMT: return createGoStmt();
      case GoPackage.SELECT_STMT: return createSelectStmt();
      case GoPackage.COMM_CLAUSE: return createCommClause();
      case GoPackage.COMM_CASE: return createCommCase();
      case GoPackage.RECV_STMT: return createRecvStmt();
      case GoPackage.RECV_EXPR: return createRecvExpr();
      case GoPackage.RETURN_STMT: return createReturnStmt();
      case GoPackage.BREAK_STMT: return createBreakStmt();
      case GoPackage.CONTINUE_STMT: return createContinueStmt();
      case GoPackage.GOTO_STMT: return createGotoStmt();
      case GoPackage.DEFER_STMT: return createDeferStmt();
      case GoPackage.PACKAGE_CLAUSE: return createPackageClause();
      case GoPackage.PACKAGE_NAME: return createPackageName();
      case GoPackage.IMPORT_DECL: return createImportDecl();
      case GoPackage.IMPORT_SPEC: return createImportSpec();
      case GoPackage.IMPORT_PATH: return createImportPath();
      case GoPackage.IDENTIFIER: return createidentifier();
      case GoPackage.FLOAT_LIT: return createfloat_lit();
      case GoPackage.STRING_LIT: return createstring_lit();
      case GoPackage.DECIMALS: return createdecimals();
      case GoPackage.EXPONENT: return createexponent();
      case GoPackage.IMAGINARY_LIT: return createimaginary_lit();
      case GoPackage.RUNE_LIT: return createrune_lit();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SouceFile createSouceFile()
  {
    SouceFileImpl souceFile = new SouceFileImpl();
    return souceFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName createTypeName()
  {
    TypeNameImpl typeName = new TypeNameImpl();
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeNameLinha createTypeNameLinha()
  {
    TypeNameLinhaImpl typeNameLinha = new TypeNameLinhaImpl();
    return typeNameLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLit createTypeLit()
  {
    TypeLitImpl typeLit = new TypeLitImpl();
    return typeLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLitLinha createTypeLitLinha()
  {
    TypeLitLinhaImpl typeLitLinha = new TypeLitLinhaImpl();
    return typeLitLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayLength createArrayLength()
  {
    ArrayLengthImpl arrayLength = new ArrayLengthImpl();
    return arrayLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType createElementType()
  {
    ElementTypeImpl elementType = new ElementTypeImpl();
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructType createStructType()
  {
    StructTypeImpl structType = new StructTypeImpl();
    return structType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDecl createFieldDecl()
  {
    FieldDeclImpl fieldDecl = new FieldDeclImpl();
    return fieldDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbeddedField createEmbeddedField()
  {
    EmbeddedFieldImpl embeddedField = new EmbeddedFieldImpl();
    return embeddedField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tag createTag()
  {
    TagImpl tag = new TagImpl();
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointerType createPointerType()
  {
    PointerTypeImpl pointerType = new PointerTypeImpl();
    return pointerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionType createFunctionType()
  {
    FunctionTypeImpl functionType = new FunctionTypeImpl();
    return functionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature createSignature()
  {
    SignatureImpl signature = new SignatureImpl();
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Result createResult()
  {
    ResultImpl result = new ResultImpl();
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters createParameters()
  {
    ParametersImpl parameters = new ParametersImpl();
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList createParameterList()
  {
    ParameterListImpl parameterList = new ParameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDecl createParameterDecl()
  {
    ParameterDeclImpl parameterDecl = new ParameterDeclImpl();
    return parameterDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceType createInterfaceType()
  {
    InterfaceTypeImpl interfaceType = new InterfaceTypeImpl();
    return interfaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodSpec createMethodSpec()
  {
    MethodSpecImpl methodSpec = new MethodSpecImpl();
    return methodSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName createMethodName()
  {
    MethodNameImpl methodName = new MethodNameImpl();
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceTypeName createInterfaceTypeName()
  {
    InterfaceTypeNameImpl interfaceTypeName = new InterfaceTypeNameImpl();
    return interfaceTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapType createMapType()
  {
    MapTypeImpl mapType = new MapTypeImpl();
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyType createKeyType()
  {
    KeyTypeImpl keyType = new KeyTypeImpl();
    return keyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelType createChannelType()
  {
    ChannelTypeImpl channelType = new ChannelTypeImpl();
    return channelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementList createStatementList()
  {
    StatementListImpl statementList = new StatementListImpl();
    return statementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelDecl createTopLevelDecl()
  {
    TopLevelDeclImpl topLevelDecl = new TopLevelDeclImpl();
    return topLevelDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public topLevelDeclLinha createtopLevelDeclLinha()
  {
    topLevelDeclLinhaImpl topLevelDeclLinha = new topLevelDeclLinhaImpl();
    return topLevelDeclLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstDecl createConstDecl()
  {
    ConstDeclImpl constDecl = new ConstDeclImpl();
    return constDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstSpec createConstSpec()
  {
    ConstSpecImpl constSpec = new ConstSpecImpl();
    return constSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierList createIdentifierList()
  {
    IdentifierListImpl identifierList = new IdentifierListImpl();
    return identifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList createExpressionList()
  {
    ExpressionListImpl expressionList = new ExpressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl createTypeDecl()
  {
    TypeDeclImpl typeDecl = new TypeDeclImpl();
    return typeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpec createTypeSpec()
  {
    TypeSpecImpl typeSpec = new TypeSpecImpl();
    return typeSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasDecl createAliasDecl()
  {
    AliasDeclImpl aliasDecl = new AliasDeclImpl();
    return aliasDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarSpec createVarSpec()
  {
    VarSpecImpl varSpec = new VarSpecImpl();
    return varSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShortVarDecl createShortVarDecl()
  {
    ShortVarDeclImpl shortVarDecl = new ShortVarDeclImpl();
    return shortVarDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDecl createFunctionDecl()
  {
    FunctionDeclImpl functionDecl = new FunctionDeclImpl();
    return functionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionName createFunctionName()
  {
    FunctionNameImpl functionName = new FunctionNameImpl();
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBody createFunctionBody()
  {
    FunctionBodyImpl functionBody = new FunctionBodyImpl();
    return functionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDecl createMethodDecl()
  {
    MethodDeclImpl methodDecl = new MethodDeclImpl();
    return methodDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Receiver createReceiver()
  {
    ReceiverImpl receiver = new ReceiverImpl();
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operand createOperand()
  {
    OperandImpl operand = new OperandImpl();
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicLit createBasicLit()
  {
    BasicLitImpl basicLit = new BasicLitImpl();
    return basicLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperandName createOperandName()
  {
    OperandNameImpl operandName = new OperandNameImpl();
    return operandName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedIdent createQualifiedIdent()
  {
    QualifiedIdentImpl qualifiedIdent = new QualifiedIdentImpl();
    return qualifiedIdent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeLit createCompositeLit()
  {
    CompositeLitImpl compositeLit = new CompositeLitImpl();
    return compositeLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralType createLiteralType()
  {
    LiteralTypeImpl literalType = new LiteralTypeImpl();
    return literalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralTypeLinha createLiteralTypeLinha()
  {
    LiteralTypeLinhaImpl literalTypeLinha = new LiteralTypeLinhaImpl();
    return literalTypeLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralValue createLiteralValue()
  {
    LiteralValueImpl literalValue = new LiteralValueImpl();
    return literalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementList createElementList()
  {
    ElementListImpl elementList = new ElementListImpl();
    return elementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyedElement createKeyedElement()
  {
    KeyedElementImpl keyedElement = new KeyedElementImpl();
    return keyedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key createKey()
  {
    KeyImpl key = new KeyImpl();
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldName createFieldName()
  {
    FieldNameImpl fieldName = new FieldNameImpl();
    return fieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionLit createFunctionLit()
  {
    FunctionLitImpl functionLit = new FunctionLitImpl();
    return functionLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpr createPrimaryExpr()
  {
    PrimaryExprImpl primaryExpr = new PrimaryExprImpl();
    return primaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExprLinha createPrimaryExprLinha()
  {
    PrimaryExprLinhaImpl primaryExprLinha = new PrimaryExprLinhaImpl();
    return primaryExprLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ponto createponto()
  {
    pontoImpl ponto = new pontoImpl();
    return ponto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public cochetes createcochetes()
  {
    cochetesImpl cochetes = new cochetesImpl();
    return cochetes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector createSelector()
  {
    SelectorImpl selector = new SelectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Index createIndex()
  {
    IndexImpl index = new IndexImpl();
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Slice createSlice()
  {
    SliceImpl slice = new SliceImpl();
    return slice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAssertion createTypeAssertion()
  {
    TypeAssertionImpl typeAssertion = new TypeAssertionImpl();
    return typeAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arguments createArguments()
  {
    ArgumentsImpl arguments = new ArgumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodExpr createMethodExpr()
  {
    MethodExprImpl methodExpr = new MethodExprImpl();
    return methodExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReceiverType createReceiverType()
  {
    ReceiverTypeImpl receiverType = new ReceiverTypeImpl();
    return receiverType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionLinha createExpressionLinha()
  {
    ExpressionLinhaImpl expressionLinha = new ExpressionLinhaImpl();
    return expressionLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpr createUnaryExpr()
  {
    UnaryExprImpl unaryExpr = new UnaryExprImpl();
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public binary_op createbinary_op()
  {
    binary_opImpl binary_op = new binary_opImpl();
    return binary_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conversion createConversion()
  {
    ConversionImpl conversion = new ConversionImpl();
    return conversion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleStmt createSimpleStmt()
  {
    SimpleStmtImpl simpleStmt = new SimpleStmtImpl();
    return simpleStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabeledStmt createLabeledStmt()
  {
    LabeledStmtImpl labeledStmt = new LabeledStmtImpl();
    return labeledStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionStmt createExpressionStmt()
  {
    ExpressionStmtImpl expressionStmt = new ExpressionStmtImpl();
    return expressionStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SendStmt createSendStmt()
  {
    SendStmtImpl sendStmt = new SendStmtImpl();
    return sendStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Channel createChannel()
  {
    ChannelImpl channel = new ChannelImpl();
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncDecStmt createIncDecStmt()
  {
    IncDecStmtImpl incDecStmt = new IncDecStmtImpl();
    return incDecStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStmt createIfStmt()
  {
    IfStmtImpl ifStmt = new IfStmtImpl();
    return ifStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStmt createSwitchStmt()
  {
    SwitchStmtImpl switchStmt = new SwitchStmtImpl();
    return switchStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprCaseClause createExprCaseClause()
  {
    ExprCaseClauseImpl exprCaseClause = new ExprCaseClauseImpl();
    return exprCaseClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSwitchCase createExprSwitchCase()
  {
    ExprSwitchCaseImpl exprSwitchCase = new ExprSwitchCaseImpl();
    return exprSwitchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public switch_stmt_linha createswitch_stmt_linha()
  {
    switch_stmt_linhaImpl switch_stmt_linha = new switch_stmt_linhaImpl();
    return switch_stmt_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSwitchGuard createTypeSwitchGuard()
  {
    TypeSwitchGuardImpl typeSwitchGuard = new TypeSwitchGuardImpl();
    return typeSwitchGuard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeCaseClause createTypeCaseClause()
  {
    TypeCaseClauseImpl typeCaseClause = new TypeCaseClauseImpl();
    return typeCaseClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSwitchCase createTypeSwitchCase()
  {
    TypeSwitchCaseImpl typeSwitchCase = new TypeSwitchCaseImpl();
    return typeSwitchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeList createTypeList()
  {
    TypeListImpl typeList = new TypeListImpl();
    return typeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStmt createForStmt()
  {
    ForStmtImpl forStmt = new ForStmtImpl();
    return forStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForClause createForClause()
  {
    ForClauseImpl forClause = new ForClauseImpl();
    return forClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitStmt createInitStmt()
  {
    InitStmtImpl initStmt = new InitStmtImpl();
    return initStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostStmt createPostStmt()
  {
    PostStmtImpl postStmt = new PostStmtImpl();
    return postStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeClause createRangeClause()
  {
    RangeClauseImpl rangeClause = new RangeClauseImpl();
    return rangeClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoStmt createGoStmt()
  {
    GoStmtImpl goStmt = new GoStmtImpl();
    return goStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStmt createSelectStmt()
  {
    SelectStmtImpl selectStmt = new SelectStmtImpl();
    return selectStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommClause createCommClause()
  {
    CommClauseImpl commClause = new CommClauseImpl();
    return commClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommCase createCommCase()
  {
    CommCaseImpl commCase = new CommCaseImpl();
    return commCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecvStmt createRecvStmt()
  {
    RecvStmtImpl recvStmt = new RecvStmtImpl();
    return recvStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecvExpr createRecvExpr()
  {
    RecvExprImpl recvExpr = new RecvExprImpl();
    return recvExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStmt createReturnStmt()
  {
    ReturnStmtImpl returnStmt = new ReturnStmtImpl();
    return returnStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakStmt createBreakStmt()
  {
    BreakStmtImpl breakStmt = new BreakStmtImpl();
    return breakStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContinueStmt createContinueStmt()
  {
    ContinueStmtImpl continueStmt = new ContinueStmtImpl();
    return continueStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GotoStmt createGotoStmt()
  {
    GotoStmtImpl gotoStmt = new GotoStmtImpl();
    return gotoStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeferStmt createDeferStmt()
  {
    DeferStmtImpl deferStmt = new DeferStmtImpl();
    return deferStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageClause createPackageClause()
  {
    PackageClauseImpl packageClause = new PackageClauseImpl();
    return packageClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageName createPackageName()
  {
    PackageNameImpl packageName = new PackageNameImpl();
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportDecl createImportDecl()
  {
    ImportDeclImpl importDecl = new ImportDeclImpl();
    return importDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportSpec createImportSpec()
  {
    ImportSpecImpl importSpec = new ImportSpecImpl();
    return importSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportPath createImportPath()
  {
    ImportPathImpl importPath = new ImportPathImpl();
    return importPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier createidentifier()
  {
    identifierImpl identifier = new identifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float_lit createfloat_lit()
  {
    float_litImpl float_lit = new float_litImpl();
    return float_lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public string_lit createstring_lit()
  {
    string_litImpl string_lit = new string_litImpl();
    return string_lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public decimals createdecimals()
  {
    decimalsImpl decimals = new decimalsImpl();
    return decimals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exponent createexponent()
  {
    exponentImpl exponent = new exponentImpl();
    return exponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public imaginary_lit createimaginary_lit()
  {
    imaginary_litImpl imaginary_lit = new imaginary_litImpl();
    return imaginary_lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rune_lit createrune_lit()
  {
    rune_litImpl rune_lit = new rune_litImpl();
    return rune_lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoPackage getGoPackage()
  {
    return (GoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GoPackage getPackage()
  {
    return GoPackage.eINSTANCE;
  }

} //GoFactoryImpl
