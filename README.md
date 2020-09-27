# Java-Layout-Manager
The LayoutManagers are used to arrange components in a particular manner. LayoutManager is an interface that is implemented by all the classes of layout managers. 

Java BorderLayout:-

The BorderLayout is used to arrange the components in five regions: north, south, east, west and center. Each region (area) may contain one component only. It is the default layout of frame or window. 
Constructors of BorderLayout class:-

BorderLayout(): creates a border layout but with no gaps between the components.
JBorderLayout(int hgap, int vgap): creates a border layout with the given horizontal and vertical gaps between the components.

Java GridLayout:-

The GridLayout is used to arrange the components in rectangular grid. One component is displayed in each rectangle.
Constructors of GridLayout class
GridLayout(): creates a grid layout with one column per component in a row.
GridLayout(int rows, int columns): creates a grid layout with the given rows and columns but no gaps between the components.
GridLayout(int rows, int columns, int hgap, int vgap): creates a grid layout with the given rows and columns alongwith given horizontal and vertical gaps.

Java FlowLayout:-

The FlowLayout is used to arrange the components in a line, one after another (in a flow). It is the default layout of applet or panel.
Constructors of FlowLayout class:-

FlowLayout(): creates a flow layout with centered alignment and a default 5 unit horizontal and vertical gap.
FlowLayout(int align): creates a flow layout with the given alignment and a default 5 unit horizontal and vertical gap.
FlowLayout(int align, int hgap, int vgap): creates a flow layout with the given alignment and the given horizontal and vertical gap.

Java BoxLayout:-

The BoxLayout is used to arrange the components either vertically or horizontally. 
Note: BoxLayout class is found in javax.swing package.
Constructor of BoxLayout class:-

BoxLayout(Container c, int axis): creates a box layout that arranges the components with the given axis.

Java GridBagLayout:-

The Java GridBagLayout class is used to align components vertically, horizontally or along their baseline.
The components may not be of same size. Each GridBagLayout object maintains a dynamic, rectangular grid of cells. Each component occupies one or more cells known as its display area. Each component associates an instance of GridBagConstraints. With the help of constraints object we arrange component's display area on the grid. The GridBagLayout manages each component's minimum and preferred sizes in order to determine component's size.

Java CardLayout:-

The CardLayout class manages the components in such a manner that only one component is visible at a time. It treats each component as a card that is why it is known as CardLayout.
Constructors of CardLayout class:-

CardLayout(): creates a card layout with zero horizontal and vertical gap.
CardLayout(int hgap, int vgap): creates a card layout with the given horizontal and vertical gap.
