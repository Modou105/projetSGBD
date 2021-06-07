
import matplotlib.pyplot as plt
import pandas as pd
from shapely.geometry import Point

import qeds
import geopandas as gpd
qeds.themes.mpl_style();
df = pd.DataFrame({
    'Region': ['Dakar', 'Tambacounda', 'Kolda', 'Fatick', 'Sedhiou','Diourbel','Louga','Thies','Saint-louis','Ziguinchor','Kedougou','Kaolack','Matam','Kaffrine'],
    'Localite': ['Touba', 'Libert6', 'Mariste', 'Gounass', 'Almadie','medina','balakos'],
    
})
df["Coordinates"] = list(zip(df.Longitude, df.Latitude))
df.head()
df["Coordinates"] = df["Coordinates"].apply(Point)
df.head()
gdf = gpd.GeoDataFrame(df, geometry="Coordinates")
gdf.head()
# Tracez les villes sur la carte
# Nous utilisons principalement le code d'avant --- nous voulons toujours que les frontières des pays soient tracées --- et nous ajoutons une commande pour tracer les villes
fig, gax = plt.subplots(figsize=(10,10))


world.query("Pays == 'SENEGAL'").plot(ax = gax, edgecolor='black', color='white')

# traçons à partir d'un GeoDataFrame différent
# les villes par des points rouge
gdf.plot(ax=gax, color='red', alpha = 0.5)

gax.set_title('Senegal')


# Étiqueter les villes
for x, y, label in zip(gdf['Coordinates'].x, gdf['Coordinates'].y, gdf['City']):
    gax.annotate(label, xy=(x,y), xytext=(4,4), textcoords='offset points')

plt.show()
